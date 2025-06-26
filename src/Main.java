import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner todoSc = new Scanner(System.in);
        ArrayList<Todo> todos = new ArrayList<>();

        System.out.println("================================");
        System.out.println("📝Todo 프로그램에 오신 것을 환영합니다!");
        System.out.println("================================");

        todos:
        while (true) {
            System.out.println("\n📋메뉴를 선택하세요:");
            System.out.println("1. ➕ Todo 추가");
            System.out.println("2. 📃 Todo 목록");
            System.out.println("3. 🔄 Todo 상태 변경");
            System.out.println("4. 🚪 종료하기");
            System.out.print("선택: ");
            String choice = todoSc.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("📝 새로운 Todo를 입력하세요: "); // ""내용이 출력된다.
                    String todoDescription = todoSc.nextLine(); // todo 기입하는 내용이 todoDescription에 저장된다.
                    Todo todoItem = new Todo(todoDescription); // todoItem은 새로운 todo다(디스크립션에 담기는).
                    todos.add(todoItem); //todos에 새로운 할일을 더한다.
//                    todos.add(todoDescription);
                    break;
                case "2":
                    for (Todo todotodo : todos) { //todo todotodo는 todos이다.
                        if (todotodo == null) { // 만약 todotodo 가 비어있다면 멈춰
                            break;
                        } else {
                            System.out.println(todotodo);
                        }
                    }
                    break;
                case "3":
                    // 완료되면 todos에서 선택된 거 하나 삭제하기
                    // 몇 번을 완료하셨나요?
                    System.out.println("✔️몇 번째 Todo를 완료하셨나요?:"); // 내용 출력
                    int completeTodo = todoSc.nextInt() - 1; //완료한 리스트에서 내가 작성한 리스트의 번호는 -1, 숫자는 1부터 기준되어 출력된다.
//                    todoSc.nextLine();

                    if (completeTodo >= todos.size() || completeTodo < 0) { //만약 완려된
                        System.out.println("올바른 값을 입력하세요.");
                        continue;
                    }

                    Todo findedTodo = todos.get(completeTodo); //todo1이 todos 끝난 리스트를 가지고 온 것
                    findedTodo.setCompleted(true);// todo1이 확인 한 것이 참이다.
//                    todos.remove(completeTodo);
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
