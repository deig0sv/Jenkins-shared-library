import org.jenkinsci.plugins.pipeline.modeldefinition.Utils
import groovy.transform.Field
import org.foo.utils

@Field def utility = new utils()


def deploy(Map params = [:]){
    def charact = utility.getInfoResource()
    //println "Desplegando Caracteristica: ${charact}"
    println "Desplegando Caracteristica: ${params.project}"
}