package FileDecorator;

public class FileDecorator_Demo {
    public static void main(String[] args) {
        String salaryRecords = """
                EmployeeID,Name,Salary
                1,Najeeb,5000000
                2,Eshan,60000000
                3,Nabil,55000000
                4,Kishan,6500000
                5,Malik,70000000
                """;
        FileDataSource salary = new FileDataSource("SalaryRecords.txt");
        salary.writeData(salaryRecords);

        System.out.println("Original Data:");
        System.out.println(salary.readOriginalData());
        System.out.println("--------------------------------------------------");

        System.out.println("1. Compressed():");
        DataSource compressed = new CompressionDecorator(salary);
        compressed.writeData(salaryRecords);
        System.out.println(compressed.readOriginalData());
        System.out.println("--------------------------------------------------");

        System.out.println("2. Encrypted():");
        DataSource encrypted = new EncryptionDecorator(salary);
        encrypted.writeData(salaryRecords);
        System.out.println(encrypted.readOriginalData());
        System.out.println("--------------------------------------------------");

        System.out.println("3. UTF8():");
        DataSource utf8 = new UTF8Decorator(salary);
        utf8.writeData(salaryRecords);
        System.out.println(utf8.readOriginalData());
        System.out.println("--------------------------------------------------");

        System.out.println("4. Encrypted(Compressed()):");
        DataSource encryptedAndCompressed = new EncryptionDecorator(new CompressionDecorator(salary));
        encryptedAndCompressed.writeData(salaryRecords);
        System.out.println(encryptedAndCompressed.readOriginalData());
        System.out.println("--------------------------------------------------");

        System.out.println("5. Compressed(Encrypted()):");
        DataSource compressedAndEncrypted = new CompressionDecorator(new EncryptionDecorator(salary));
        compressedAndEncrypted.writeData(salaryRecords);
        System.out.println(compressedAndEncrypted.readOriginalData());
        System.out.println("--------------------------------------------------");

        System.out.println("6. UTF8(Compressed()):");
        DataSource utf8AndCompressed = new UTF8Decorator(new CompressionDecorator(salary));
        utf8AndCompressed.writeData(salaryRecords);
        System.out.println(utf8AndCompressed.readOriginalData());
        System.out.println("--------------------------------------------------");

        System.out.println("7. Compressed(UTF8()):");
        DataSource compressedAndUtf8 = new CompressionDecorator(new UTF8Decorator(salary));
        compressedAndUtf8.writeData(salaryRecords);
        System.out.println(compressedAndUtf8.readOriginalData());
        System.out.println("--------------------------------------------------");

        System.out.println("8. UTF8(Encrypted()):");
        DataSource utf8AndEncrypted = new UTF8Decorator(new EncryptionDecorator(salary));
        utf8AndEncrypted.writeData(salaryRecords);
        System.out.println(utf8AndEncrypted.readOriginalData());
        System.out.println("--------------------------------------------------");

        System.out.println("9. Encrypted(UTF8()):");
        DataSource encryptedAndUtf8 = new EncryptionDecorator(new UTF8Decorator(salary));
        encryptedAndUtf8.writeData(salaryRecords);
        System.out.println(encryptedAndUtf8.readOriginalData());
        System.out.println("--------------------------------------------------");

        System.out.println("10. UTF8(Encrypted(Compressed())):");
        DataSource utf8AndEncryptedAndCompressed = new UTF8Decorator(new EncryptionDecorator(new CompressionDecorator(salary)));
        utf8AndEncryptedAndCompressed.writeData(salaryRecords);
        System.out.println(utf8AndEncryptedAndCompressed.readOriginalData());
        System.out.println("--------------------------------------------------");

        System.out.println("11. UTF8(Compressed(Encrypted())):");
        DataSource utf8AndCompressedAndEncrypted = new UTF8Decorator(new CompressionDecorator(new EncryptionDecorator(salary)));
        utf8AndCompressedAndEncrypted.writeData(salaryRecords);
        System.out.println(utf8AndCompressedAndEncrypted.readOriginalData());
        System.out.println("--------------------------------------------------");

        System.out.println("12. Compressed(UTF8(Encrypted())):");
        DataSource compressedAndUtf8AndEncrypted = new CompressionDecorator(new UTF8Decorator(new EncryptionDecorator(salary)));
        compressedAndUtf8AndEncrypted.writeData(salaryRecords);
        System.out.println(compressedAndUtf8AndEncrypted.readOriginalData());
        System.out.println("--------------------------------------------------");

        System.out.println("13. Compressed(Encrypted(UTF8())):");
        DataSource compressedAndEncryptedAndUtf8 = new CompressionDecorator(new EncryptionDecorator(new UTF8Decorator(salary)));
        compressedAndEncryptedAndUtf8.writeData(salaryRecords);
        System.out.println(compressedAndEncryptedAndUtf8.readOriginalData());
        System.out.println("--------------------------------------------------");

        System.out.println("14. Encrypted(UTF8(Compressed())):");
        DataSource encryptedAndUtf8AndCompressed = new EncryptionDecorator(new UTF8Decorator(new CompressionDecorator(salary)));
        encryptedAndUtf8AndCompressed.writeData(salaryRecords);
        System.out.println(encryptedAndUtf8AndCompressed.readOriginalData());
        System.out.println("--------------------------------------------------");
    }
}
