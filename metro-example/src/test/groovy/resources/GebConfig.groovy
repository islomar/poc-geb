import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.firefox.FirefoxProfile
import org.openqa.selenium.Dimension
import org.openqa.selenium.Point

def LOCALE_ES = "es"

// Use Firefox by default
driver = {
    return setFirefoxDriver(LOCALE_ES)
}

baseUrl = "http://www.metromadrid.es/"

environments {

    // run as “mvn clean test -Dgeb.env=chrome”
    chrome {
        driver = "chrome"
    }

    // run as “mvn clean test -Dgeb.env=firefox”
    firefox {
        driver = { return setFirefoxDriver(LOCALE_ES) }
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