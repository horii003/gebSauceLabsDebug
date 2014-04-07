import geb.driver.SauceLabsDriverFactory

waiting {
    timeout = 2
}

def sauceBrowser = System.getProperty("geb.sauce.browser")
System.err.println("${sauceBrowser}") //null here. SauceLabs plugin does not set sauceBrower with 'gradle test' & 'gradle grails-test-app' command?

if (sauceBrowser) {
    driver = {
        def username = System.getenv("GEB_SAUCE_LABS_USER")
        def accessKey = System.getenv("GEB_SAUCE_LABS_ACCESS_PASSWORD")
        new SauceLabsDriverFactory().create(sauceBrowser, username, accessKey)
    }
}


