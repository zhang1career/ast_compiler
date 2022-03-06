package lab.zhang.risk.ast_compiler.annotation.api_audit.entity;

import cn.hutool.core.util.IdUtil;
import lab.zhang.risk.ast_compiler.annotation.api_audit.enums.ConstraintEnum;
import lab.zhang.risk.ast_compiler.annotation.api_audit.enums.FieldAccessEnum;
import lab.zhang.risk.ast_compiler.annotation.api_audit.enums.FieldTypeEnum;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;


@Data
public class ApiField {
    private String fieldNo;
    private String fieldName;
    private String fieldDesc;

    private FieldAccessEnum fieldAccess;
    private FieldTypeEnum fieldType;

    Map<ConstraintEnum, ?> constraintMap;


    public ApiField(String fieldName, String fieldDesc, FieldAccessEnum fieldAccess, FieldTypeEnum fieldType, Map<ConstraintEnum, ?> constraintMap) {
        this.fieldNo = IdUtil.simpleUUID();
        this.fieldName = fieldName;
        this.fieldDesc = fieldDesc;
        this.fieldAccess = fieldAccess;
        this.fieldType = fieldType;
        this.constraintMap = constraintMap != null ? new HashMap<>(constraintMap) : new HashMap<>();
    }


    static public ApiField of(String fieldName, String fieldDesc, FieldAccessEnum fieldAccess, FieldTypeEnum fieldType, Map<ConstraintEnum, ?> constraintMap) {
        return new ApiField(fieldName, fieldDesc, fieldAccess, fieldType, constraintMap);
    }

    static public ApiField of(String fieldName, String fieldDesc, FieldTypeEnum fieldType, Map<ConstraintEnum, ?> constraintMap) {
        return new ApiField(fieldName, fieldDesc, FieldAccessEnum.NORMAL, fieldType, constraintMap);
    }
}
