import groovy.transform.Field
import org.foo.utils

@Field def utils = new utils()


def deploy(Map params = [:]){
    def charact = utils.getInfoResource(
        resourceName: "projects.json",
        project: params.project,
        environment: params.environment,
        object: params.object
    )
    println "Desplegando Caracteristica: ${charact}"
}