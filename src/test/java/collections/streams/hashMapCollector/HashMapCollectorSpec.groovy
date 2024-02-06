package collections.streams.hashMapCollector

import spock.lang.Specification

class HashMapCollectorSpec extends Specification{
    def HashMapCollector fixture

    def setup(){
        fixture = new HashMapCollector()
    }

    def "testingHashMapCollector"(){
        when
        def response = fixture.getHashMap()

        then
        response != null
    }
}
