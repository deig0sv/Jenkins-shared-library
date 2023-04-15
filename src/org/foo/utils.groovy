package org.foo

def getInfoResource(Map params = [:]){
    def request = libraryResource "${params.resourceName}"
    def info = readJSON text: request
    def project = param.project
    def environment = param.environment
    def object = param.object

    return info."${project}"."${environment}"."${object}"
}