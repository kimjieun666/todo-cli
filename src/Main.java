import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner todoSc = new Scanner(System.in);
        ArrayList<String> todos = new ArrayList<>();

        System.out.println("================================");
        System.out.println("📝 Todo 프로그램에 오신 것을 환영합니다!");
        System.out.println("================================");

        todos: while (true) {
            System.out.println("\n📋메뉴를 선택하세요:");
            System.out.println("1. ➕ Todo 추가");
            System.out.println("2. 📃 Todo 목록");
            System.out.println("3. 🔄 Todo 상태 변경");
            System.out.println("4. 🚪 종료하기");
            System.out.print("선택: ");
            String choice = todoSc.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("📝 새로운 Todo를 입력하세요: ");
                    String todo = todoSc.nextLine();
                    todos.add(todo);
                    break;
                case "2":
                    for (String aaa : todos) {
                        if (aaa == null) {
                            break;
                        } else {
                            System.out.println(aaa);
                        }
                    }
                    break;
                case "3":
                    // 완료되면 todos에서 선택된 거 하나 삭제하기
                    // 몇 번을 완료하셨나요?
                    System.out.println("✔️ 몇 번째 Todo를 완료하셨나요?: ");
                    int completeTodo = todoSc.nextInt()-1;
                    todoSc.nextLine();

                    int size = todos.size();
                    if(completeTodo >= todos.size() || completeTodo < 0) {
                        System.out.println("올바른 값을 입력하세요.");
                        continue;
                    }

                    todos.remove(completeTodo);
                    break;
                case "4":
                   break todos;
                default:
                    System.out.println("❌ 잘못된 선택입니다. 1-4 사이의 숫자를 입력해주세요.");

            }
        }

        System.out.println("================================");
        System.out.println("안녕히가세요.");
        System.out.println("================================");
    }
}
