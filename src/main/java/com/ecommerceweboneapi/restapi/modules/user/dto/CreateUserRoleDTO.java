package com.ecommerceweboneapi.restapi.modules.user.dto;

import java.util.List;

import lombok.Data;

@Data
public class CreateUserRoleDTO {
    
    private Long idUser;

    private List<Long> idsRoles;

}
