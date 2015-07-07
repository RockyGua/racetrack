package com.acme
import grails.test.mixin.TestFor
/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
//@TestMixin(GrailsUnitTestMixin)
@TestFor(Race)
class RaceTests{

    void testInMiles() {
       def race = new Race(distance: 5.0)
        assertNotNull(race.inMiles())
//        assertEquals(5.0, race.inMiles())
    }
}
