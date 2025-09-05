class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
                boolean isNext = true;
        ListNode result = null;

        while (isNext) {
            if (list1 == null && list2 == null) {
                isNext = false;
                break;
            }

            boolean isOnlyLeft = list1 != null && list2 == null;
            boolean isOnlyRight = list2 != null && list1 == null;
            boolean isMerged = list1 != null && list2 != null;

            boolean isLeftMove = false;
            boolean isRightMove = false;

            if (isOnlyLeft) {
                if (result == null) {
                    result = new ListNode(list1.val);
                } else {
                    ListNode temp = new ListNode(list1.val);
                    ListNode lastResultNext = result;
                    boolean isLastNext = true;

                    while (isLastNext) {
                        if (lastResultNext.next == null) {
                            isLastNext = false;
                        } else {
                            lastResultNext = lastResultNext.next;
                        }
                    }
                    lastResultNext.next = temp;
                }
                isLeftMove = true;
            } else if (isOnlyRight) {
                if (result == null) {
                    result = new ListNode(list2.val);
                } else {
                    ListNode temp = new ListNode(list2.val);
                    ListNode lastResultNext = result;
                    boolean isLastNext = true;

                    while (isLastNext) {
                        if (lastResultNext.next == null) {
                            isLastNext = false;
                        } else {
                            lastResultNext = lastResultNext.next;
                        }
                    }
                    lastResultNext.next = temp;
                }
                isRightMove = true;
            } else if (isMerged) {
                int val1 = list1.val;
                int val2 = list2.val;

                if (result == null) {
                    if (val1 < val2) {
                        result = new ListNode(val1);
                        isLeftMove = true;
                    } else if (val1 == val2) {
                        result = new ListNode(val1, new ListNode(val2));
                        isLeftMove = true;
                        isRightMove = true;
                    } else {
                        result = new ListNode(val2);
                        isRightMove = true;
                    }
                } else {
                    ListNode temp = null;

                    if (val1 < val2) {
                        temp = new ListNode(val1);
                        isLeftMove = true;
                    } else if (val1 == val2) {
                        temp = new ListNode(val1, new ListNode(val2));
                        isLeftMove = true;
                        isRightMove = true;
                    } else {
                        temp = new ListNode(val2);
                        isRightMove = true;
                    }

                    boolean isLastNext = true;
                    ListNode lastResultNext = result;

                    while (isLastNext) {
                        if (lastResultNext.next == null) {
                            isLastNext = false;
                        } else {
                            lastResultNext = lastResultNext.next;
                        }
                    }
                    lastResultNext.next = temp;
                }
            }

            if (isLeftMove) {
                list1 = list1.next;
            }

            if (isRightMove) {
                list2 = list2.next;
            }
        }

        return result;

    }
}