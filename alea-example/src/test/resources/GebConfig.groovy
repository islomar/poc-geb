import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.firefox.FirefoxProfile
import org.openqa.selenium.Dimension
import org.openqa.selenium.Point
import org.openqa.selenium.htmlunit.HtmlUnitDriver

def LOCALE_ES = "es"

baseUrl = 'http://xxx:yyy@localhost:9005'

// Launch Firefox browser by default
driver = "firefox"

environments {

    // run as “mvn clean test -Dgeb.env=chrome”
    chrome {
        //driver = "chrome"
        driver = { setChromeDriver() }
    }

    // run as “mvn clean test -Dgeb.env=firefox”
    firefox {
        driver = { return setFirefoxDriver(LOCALE_ES) }
    }

    htmlunit {
        //driver = "htmlunit"
        driver = { new HtmlUnitDriver() }
    }
}

private setFirefoxDriver(locale) {
    FirefoxProfile profile = new FirefoxProfile();
    profile.setPreference( "intl.accept_languages", locale );
    def driver = new FirefoxDriver(profile)
    driver.manage().window().setPosition(new Point(0,0));
    driver.manage().window().setSize(new Dimension(1024,768));
    driver.manage().deleteAllCookies();
    return driver
}

private setChromeDriver() {
    System.setProperty("webdriver.chrome.driver", "./chromedriver");
    return new ChromeDriver()
}