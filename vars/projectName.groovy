import groovy.transform.Field
import org.foo.utils

@Field def utils = new utils()


def deploy(Map params = [:]){
    def charact = utils.getInfoResource()
    //println "Desplegando Caracteristica: ${charact}"
    println "Desplegando Caracteristica: ${params.project}"
}