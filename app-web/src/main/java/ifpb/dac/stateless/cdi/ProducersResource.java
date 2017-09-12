package ifpb.dac.stateless.cdi;

import ifpb.dac.stateless.IFCalculadora;
import javax.annotation.Resource;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Default;
import javax.enterprise.inject.Produces;

/**
 * @author Ricardo Job
 */
@ApplicationScoped
public class ProducersResource {
    
    //  java:global/rhecruta-core/UserServiceImpl!br.edu.ifpb.dac.rhecruta.shared.interfaces.UserService, java:global/rhecruta-core/UserServiceImpl
    private static final String RESOURCE =  "java:global/stateless-ejb-core/CalculadoraImpl!ifpb.dac.stateless.IFCalculadora";
    
    @Dependent
    @Produces
    @Default
    private IFCalculadora getIFCalculadora() {
        return new ServiceLocator().lookup(RESOURCE, IFCalculadora.class);
    }

}
