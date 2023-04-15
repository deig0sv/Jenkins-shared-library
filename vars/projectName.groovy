import groovy.transform.Field
import org.foo.utility

@Field def utils = new utility()


def deploy(Map params = [:]){
    def charact = utils.getInfoResource(
        resourceName: "projects.json",
        project: params.project,
        environment: params.environment,
        object: params.object
    )
    println "Desplegando Caracteristica: ${charact}"
}