package proxyquestion

import io.micronaut.context.BeanContext
import io.micronaut.context.BeanLocator
import spock.lang.AutoCleanup
import spock.lang.Specification

class InterceptedBeanSpec extends Specification {

    @AutoCleanup
    BeanLocator context = BeanContext.run()

    void 'test beans'() {
        expect:
        context.getBeansOfType(Helper).size() == 1
    }
}