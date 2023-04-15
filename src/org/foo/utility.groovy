package org.foo

def getInfoResource(Map params = [:]){
    def request = libraryResource "${params.resourceName}"
    def info = readJSON text: request
    def project = params.project
    def environment = params.environment
    def object = params.object

    return info."${project}"."${environment}"."${object}"
}