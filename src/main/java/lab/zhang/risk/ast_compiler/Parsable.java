package lab.zhang.risk.ast_compiler;

import java.util.List;


/**
 * @author zhangrj
 */
public interface Parsable<S, V> {
    ParsableContext<S, V> parse(List<NestableData<S, V>> dataList, ParsableContext<S, V> context);
}
