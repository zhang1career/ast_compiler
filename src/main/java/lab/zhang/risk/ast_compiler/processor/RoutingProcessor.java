package lab.zhang.risk.ast_compiler.processor;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.lang.model.element.TypeElement;
import java.util.Set;


/**
 * @author zhangrj
 */
@SupportedAnnotationTypes("lab.zhang.risk.ast_compiler.annotation.Routing")
public class RoutingProcessor extends AbstractProcessor {

    /**
     * Whether this processor claims all processed annotations exclusively or not.
     */
    static private final boolean ANNOTATIONS_CLAIMED_EXCLUSIVELY = false;


    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        if (!roundEnv.processingOver()) {
//            RoundContext roundContext = new RoundContext(annotationProcessorContext);
//            Set deferredMappers = getAndResetDeferredMappers();
//            processMapperElements(deferredMappers, roundContext);
//
//            Set mappers = getMappers(annotations, roundEnv);
//            processMapperElements(mappers, roundContext);
        }
        return ANNOTATIONS_CLAIMED_EXCLUSIVELY;
    }
}
