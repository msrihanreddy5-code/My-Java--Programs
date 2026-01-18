class PasswordStrength {
    public static void main(String[] args) {
        String p = "Java@123";
        boolean strong = p.length()>=8 &&
                p.matches(".*[A-Z].*") &&
                p.matches(".*[a-z].*") &&
                p.matches(".*\\d.*") &&
                p.matches(".*[@#$%!].*");
        System.out.println(strong ? "Strong Password" : "Weak Password");
    }
}
