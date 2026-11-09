package utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class ScreenshotUtil {

    public static String captureScreenshot(WebDriver driver) {

        try {
            TakesScreenshot ts = (TakesScreenshot) driver;

            File source = ts.getScreenshotAs(OutputType.FILE);

            Path folder = Path.of("test-output/screenshots");
            Files.createDirectories(folder);

            Path destination = folder.resolve(
                    "screenshot_" + System.currentTimeMillis() + ".png"
            );

            Files.copy(
                    source.toPath(),
                    destination,
                    StandardCopyOption.REPLACE_EXISTING
            );

            return destination.toAbsolutePath().toString();

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
