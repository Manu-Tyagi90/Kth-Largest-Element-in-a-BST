## **Problem Statement: Kth Largest Element in a BST**  

**Given** a **Binary Search Tree (BST)** and an integer **k**, find the **kth largest element** in the BST.  

---

### **Example 1**  
#### **Input:**
```
        5
       / \
      3   6
     / \
    2   4
```
`k = 2`  

#### **Output:**  
`5`  

#### **Explanation:**  
The elements in **descending order** are `[6, 5, 4, 3, 2]`. The **2nd largest** element is `5`.

---

### **Example 2**  
#### **Input:**
```
        7
       / \
      4   9
     /   / \
    2   8   10
```
`k = 3`  

#### **Output:**  
`8`  

#### **Explanation:**  
The elements in **descending order** are `[10, 9, 8, 7, 4, 2]`. The **3rd largest** element is `8`.

---

### **Constraints:**
- `1 <= k <= N` (where `N` is the number of nodes in the BST)
- The BST contains **unique values**.
- The BST follows the standard properties:
  - Left subtree contains only nodes with values **less than** the root.
  - Right subtree contains only nodes with values **greater than** the root.
