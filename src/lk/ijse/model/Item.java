/*----------------------------------------------------------------------------------------------
 *Copyright(C) GDSE-56-GIT Exam. All rights reserved.
 *Licensed under the MIT License. See License, txt in the project root for license information.
 *---------------------------------------------------------------------------------------------*/

package lk.ijse.model;

import java.math.BigDecimal;

/**
 * @author Tharushi Welarathna <nirmanitharushi1@gmail.com>
 * @since 10/9/2021
 */
public class Item {
      private String itemCode;
      private String description;
      private int qtyOnHand;
     private BigDecimal price;

    public Item() {
    }

    public Item(String itemCode, String description, int qtyOnHand, BigDecimal price) {
        this.itemCode = itemCode;
        this.description = description;
        this.qtyOnHand = qtyOnHand;
        this.price = price;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQtyOnHand() {
        return qtyOnHand;
    }

    public void setQtyOnHand(int qtyOnHand) {
        this.qtyOnHand = qtyOnHand;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemCode='" + itemCode + '\'' +
                ", description='" + description + '\'' +
                ", qtyOnHand=" + qtyOnHand +
                ", price=" + price +
                '}';
    }
}
