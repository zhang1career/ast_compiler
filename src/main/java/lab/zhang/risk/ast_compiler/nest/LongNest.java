package lab.zhang.risk.ast_compiler.nest;

import lombok.Data;
import lombok.EqualsAndHashCode;


/**
 * @author zhangrj
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class LongNest<V> extends BaseNest<Long, V> {
}
