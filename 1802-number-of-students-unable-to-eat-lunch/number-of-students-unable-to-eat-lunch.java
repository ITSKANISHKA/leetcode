class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int[] counts = new int[2];
        for (int student : students) counts[student]++;
        
        int remaining = sandwiches.length;
        for (int sandwich : sandwiches) {
            if (counts[sandwich] == 0) break;
            if (remaining-- == 0) break;
            counts[sandwich]--;
        }
        
        return remaining;
        // int count=0;

        // for(int i=0;i<sandwiches.length;i++){
        //     if(sandwiches[i]==1)count++;
        // }
        // int stud=0;
        // for(int j=0;j<students.length;j++){
        //     if(students[j]==1)stud++;
        // }
        // if(count==stud){
        //     count=0;
        // }

        // return count;
    }
}