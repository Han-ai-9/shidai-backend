package com.han.shidai.model.request;

import lombok.Data;

import java.io.Serializable;
@Data
public class TeamQuitRequest implements Serializable {


    private static final long serialVersionUID = 651486466537006707L;
    /**
     * id
     */
    private Long teamId;
}
