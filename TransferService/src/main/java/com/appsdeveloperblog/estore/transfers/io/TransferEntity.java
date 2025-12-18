package com.appsdeveloperblog.estore.transfers.io;

import java.io.Serializable;
import java.math.BigDecimal;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name="transfers")
public class TransferEntity implements Serializable{

  @Id
  @Column(nullable = false)
  private String transferId;

  @Column(nullable = false)
  private String senderId;

  @Column(nullable = false)
  private String recepientId;

  @Column(nullable = false)
  private BigDecimal amount;

}
