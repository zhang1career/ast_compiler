package lab.zhang.risk.ast_compiler.service;

import lab.zhang.risk.ast_compiler.NestableData;
import lab.zhang.risk.ast_compiler.Parsable;
import lab.zhang.risk.ast_compiler.ParsableContext;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


/**
 * @author zhangrj
 */
@Data
@NoArgsConstructor
public class ParseService<S, V> {
    private Parsable<S, V> parser;


    public ParsableContext<S, V> act(List<NestableData<S, V>> dataList, ParsableContext<S, V> context) {
        return parser.parse(dataList, context);
    }
}
