package lab.zhang.risk.ast_compiler.lexer;

import cn.hutool.core.util.StrUtil;
import lab.zhang.risk.ast_compiler.NestableData;
import lab.zhang.risk.ast_compiler.nest.BaseNest;


/**
 * @author zhangrj
 */
public class PathLexer<V> {

    public NestableData<String, V> lex(String subject, V predication) {
        NestableData<String, V> data = BaseNest.of(predication);
        data.setPath(StrUtil.split(subject, '.'));
        return data;
    }
}
