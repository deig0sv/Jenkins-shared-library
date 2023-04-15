package org.foo

def getInfoResource(Map params = [:]){
    def request = libraryResource "${params.resourceName}"
    println "${request}"
}