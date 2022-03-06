package lab.zhang.risk.ast_compiler.nest;

import lombok.Data;
import lombok.EqualsAndHashCode;


/**
 * @author zhangrj
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class StringNest<V> extends BaseNest<String, V> {
    public StringNest(V value) {
        super();
        this.value = value;
    }
}
