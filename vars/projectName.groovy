import groovy.transform.Field
import org.foo.utils

@Field def utils = new utils()


def deploy(Map params = [:]){
    def charact = utils.getInfoResource(
        resourceName: "projects.json"
    )
    println "Desplegando Caracteristica: ${charact}"
}