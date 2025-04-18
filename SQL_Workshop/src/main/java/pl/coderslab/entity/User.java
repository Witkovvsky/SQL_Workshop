package pl.coderslab.entity;

    public class User {
        private int id;
        private String userName;
        private String email;
        private String password;

        // Konstruktor bezparametrowy (opcjonalny, ale przydatny)
        public User() {
        }

        // Konstruktor z parametrami (opcjonalny, np. do tworzenia nowego użytkownika)
        public User(String userName, String email, String password) {
            this.userName = userName;
            this.email = email;
            this.password = password;
        }

        // Getter i Setter dla id
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        // Getter i Setter dla userName
        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        // Getter i Setter dla email
        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        // Getter i Setter dla password
        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
    }
