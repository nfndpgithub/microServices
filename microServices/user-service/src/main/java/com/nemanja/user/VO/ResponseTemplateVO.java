package com.nemanja.user.VO;

import com.nemanja.user.entity.UserS;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {
    private UserS userS;
    private Department department;

}
