package com.company.ThirdHomeWorkTaskThree;

public class IAssemblyLine {
    String productType;
    private boolean firstPartInstalled = false;
    private boolean secondPartInstalled = false;
    private boolean thirdPartInstalled = false;

    public IAssemblyLine(String productType) {
        this.productType = productType;
        System.out.println("Заготовка " + productType + " поступила на линию!");
    }

    private void installFirstPart(String part) {
        this.firstPartInstalled = true;
        System.out.println("Деталь " + part + " установлена!");
    }

    private void installSecondPart(String part) {
        this.secondPartInstalled = true;
        System.out.println("Деталь " + part + " установлена!");
    }

    private void installThirdPart(String part) {
        this.thirdPartInstalled = true;
        System.out.println("Деталь " + part + " установлена!");
    }

    public IAssemblyLine assembleProduct(IAssemblyLine product, ILineStep builtParts) {
        product.installFirstPart(builtParts.firstPart);
        product.installSecondPart(builtParts.secondPart);
        product.installThirdPart(builtParts.thirdPart);
        return product;
    }

}

