package com.company.ThirdHomeWorkTaskThree;

public class BuildLine {

    public static class ILineStep {

        String firstPart;
        String secondPart;
        String thirdPart;

        ILineStep(String firstPart, String secondPart, String thirdPart) {
            this.firstPart = firstPart;
            this.secondPart = secondPart;
            this.thirdPart = thirdPart;
        }

        public ILineStep buildProductPart() {
            ILineStep builtParts = new ILineStep(this.firstPart, this.secondPart, this.thirdPart);
            System.out.println("Деталь " + firstPart + " готова для сборки!");
            System.out.println("Деталь " + secondPart + " готова для сборки!");
            System.out.println("Деталь " + thirdPart + " готова для сборки!");
            return builtParts;
        }
    }

    public static class IAssemblyLine {
        String productType;
       private boolean firstPartInstalled = false;
       private boolean secondPartInstalled = false;
       private boolean thirdPartInstalled = false;

        public IAssemblyLine(String productType) {
            this.productType = productType;
            System.out.println("Заготовка " + productType + " поступила на линию!");
        }

        public void installFirstPart(String part) {
            this.firstPartInstalled = true;
            System.out.println("Деталь " + part + " установлена!");
        }

        public void installSecondPart(String part) {
            this.secondPartInstalled = true;
            System.out.println("Деталь " + part + " установлена!");
        }

        public void installThirdPart(String part) {
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

    public static void main(String[] args) {

        IAssemblyLine product = new IAssemblyLine("Notebook");
        ILineStep BuiltParts = new ILineStep("Display", "Carcass", "Motherboard");
        BuiltParts.buildProductPart();

        product.assembleProduct(product, BuiltParts);
        System.out.println("Проверка продукта...");
        System.out.println("Наличие первой детали " + product.firstPartInstalled + ".");
        System.out.println("Наличие второй детали " + product.secondPartInstalled + ".");
        System.out.println("Наличие третьей детали " + product.thirdPartInstalled + ".");
        if (product.firstPartInstalled && product.secondPartInstalled && product.thirdPartInstalled) {
            System.out.println("Сборка прошла успешно. " + "Продукт " + product.productType + " готов!");
        } else {
            System.out.println("Сборка прошла неуспешно!");
        }
    }
}



