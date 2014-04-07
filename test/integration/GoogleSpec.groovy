import geb.spock.GebSpec
import spock.lang.Stepwise
import page.GoogleHome

@Stepwise
class GoogleSpec extends GebSpec {

void "The First Link Should Be Wikipedia"() {
  given:
  to GoogleHome

  } 
}
