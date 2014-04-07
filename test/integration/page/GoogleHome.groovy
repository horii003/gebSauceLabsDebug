package page

import geb.*

class GoogleHome extends Page {
    static url = "http://google.com/ncr"
    static at = { title == "Google" }
}
