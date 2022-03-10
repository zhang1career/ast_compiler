package lab.zhang.risk.ast_compiler.parser;

import lab.zhang.risk.ast_compiler.NestableData;
import lab.zhang.risk.ast_compiler.ParsableContext;
import lab.zhang.risk.ast_compiler.context.parse.ParseContext;

import java.util.List;


/**
 * @author zhangrj
 */
public class PathParser<S, V> extends lab.zhang.risk.ast_compiler.parser.BaseParser<S, V> {

    @Override
    public ParsableContext<S, V> parse(List<NestableData<S, V>> dataList, ParsableContext<S, V> context) {
        ParseContext<S, V> parseContext = (ParseContext<S, V>) context;

        for (NestableData<S, V> data : dataList) {
            doParse(data.getPath(), data, parseContext);
        }

        return parseContext;
    }
}
