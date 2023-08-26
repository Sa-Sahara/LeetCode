package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CourseSchedule {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> coursesPrereqs = new ArrayList<>();

        // each ArrayList`ll contain dependencies of i`th course
        for (int i = 0; i < numCourses; i++) {
            coursesPrereqs.add(new ArrayList<>());
        }
        for (int[] p : prerequisites) {
            coursesPrereqs.get(p[1]).add(p[0]);
        }

        //count dependencies in int[]
        int[] indegree = new int[numCourses];
        for (List<Integer> dependencies : coursesPrereqs) {
            for (int d : dependencies) {
                indegree[d]++;
            }
        }

        //queue for breadth-first search
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < indegree.length; i++) {
            if (indegree[i] == 0) {
                queue.offer(i);
            }
        }

        // Initialize a count to check if all courses can be finished
        int count = 0;
        while (!queue.isEmpty()) {
            int tmp = queue.poll();
            count++;

            //-- the indegree of course that depends on the current course
            for (int dependency : coursesPrereqs.get(tmp)) {
                indegree[dependency]--;
                if (indegree[dependency] == 0) {
                    queue.offer(dependency);
                }
            }
        }

        return count == numCourses;
    }
}