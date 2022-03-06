package lab.zhang.risk.ast_compiler.nest;

import lab.zhang.risk.ast_compiler.NestableData;
import lombok.Data;

import java.util.List;


/**
 * @author zhangrj
 */
@Data
public class BaseNest<S, V> implements NestableData<S, V> {

    private S step;

    private S parent;

    private List<S> path;

    protected V value;

    static public <S, V> BaseNest<S, V> of(V value) {
        BaseNest<S, V> nest = new BaseNest<>();
        nest.setValue(value);
        return nest;
    }
}
