package ifpb.dac.stateless.cdi;

import ifpb.dac.stateless.IFCalculadora;
import javax.annotation.Resource;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;

/**
 * @author Ricardo Job
 */
@ApplicationScoped
public class ProducersResource {
    
    @Produces 
    @Resource(lookup = "java:global/stateless-ejb-core/CalculadoraImpl!ifpb.dac.stateless.IFCalculadora")
    private IFCalculadora calculadora;

}
