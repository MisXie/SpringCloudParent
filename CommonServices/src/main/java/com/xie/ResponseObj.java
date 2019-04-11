package com.xie;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Created by Administrator on 2019-04-11.
 */
@Getter
@Setter
@ToString
public class ResponseObj {

  public ResponseObj() {
  }

  public ResponseObj(Object object, String desc, boolean status) {
    this.object = object;
    this.desc = desc;
    this.status = status;
  }
  private Object object;

  private String desc;

  private boolean status = true;
}
