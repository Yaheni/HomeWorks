package com.company.ThirdHomeWorkTaskThree;

public class BuildLine {
    public static void main(String[] args) {

        IAssemblyLine product = new IAssemblyLine("Notebook");
        ILineStep BuiltParts = new ILineStep("Display", "Carcass", "Motherboard");
        product.assembleProduct(product, BuiltParts);
        System.out.println("Сборка прошла успешно. " + "Продукт " + product.productType + " готов!");

    }
}
