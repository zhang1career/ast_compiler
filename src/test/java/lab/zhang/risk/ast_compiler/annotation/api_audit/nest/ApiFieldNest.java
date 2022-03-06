package lab.zhang.risk.ast_compiler.annotation.api_audit.nest;

import lab.zhang.risk.ast_compiler.annotation.api_audit.entity.ApiField;
import lab.zhang.risk.ast_compiler.nest.StringNest;


public class ApiFieldNest extends StringNest<ApiField> {
    public ApiFieldNest(ApiField value) {
        super(value);
    }
}
