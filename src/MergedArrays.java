import java.util.Arrays;

public class MergedArrays {

    public static void main(String[] args) {

        //Ex:arr1 = {1,2,3,4} arr2 = {5,6,7,8} output arr3 = {1,2,3,4,5,6,7,8}

        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5, 6, 7, 8};

        int[] arr3 = new int[arr1.length + arr2.length];
        int j = 0;
        for (int each : arr1) {
            arr3[j] = each;
            j++;
        }
        for (int each : arr2) {
            arr3[j] = each;
            j++;

        }
        System.out.println(Arrays.toString(arr3));

    }
}
/*
Create a project named Arrays, create a class named MergedArrays, add gitignore file, share your project at github, add three of your group members as collaborators,
protect your master branch with at least 2 reviewers to approve for merging,then create a new branch from the master, name the new branch as sdet1,
then write a program on this sdet1 branch which can merge two arrays of integers.
Ex:arr1 = {1,2,3,4} arr2 = {5,6,7,8} output arr3 = {1,2,3,4,5,6,7,8},
 then commit and push your  changes, create a pull request,
make sure that at least two reviewers check your code.(Reviewers- pls check the code, and act as needed),
if everything is fine merge the requests, after merging make necessary changes at your local repositories.
 */