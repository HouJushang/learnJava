package annotation;

import com.sun.mirror.apt.AnnotationProcessor;
import com.sun.mirror.apt.AnnotationProcessorEnvironment;
import com.sun.mirror.declaration.TypeDeclaration;

public class InterfaceExtractorProcessor implements AnnotationProcessor {
    private final AnnotationProcessorEnvironment env;

    public InterfaceExtractorProcessor(AnnotationProcessorEnvironment env) {
        this.env = env;
    }

    public void process() {
        for (TypeDeclaration typeDeclaration : env.getSpecifiedTypeDeclarations()) {
            ExtractInterface annot = typeDeclaration.getAnnotation(ExtractInterface.class);
        }
    }
}
