package lab.zhang.risk.ast_compiler;

import java.util.List;


/**
 * @author zhangrj
 */
public interface NestableData<S, V> {

    void setStep(S step);

    S getStep();


    void setParent(S step);

    S getParent();


    void setPath(List<S> path);

    List<S> getPath();


    void setValue(V value);

    V getValue();
}
