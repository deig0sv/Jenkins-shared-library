package org.foo

def getInfoResource(){
    def request = libraryResource "projects.json"
    println "${request}"
}