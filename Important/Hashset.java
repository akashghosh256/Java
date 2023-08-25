HashSet<Integer> numbers = new HashSet<>();
        
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);

        hashSet.remove("element1");
        boolean containsElement = hashSet.contains("element2");
        System.out.println("Contains element2: " + containsElement); // Output: Contains element2: truehashSet.clear();
        hashSet.clear();

        
        System.out.println("Size: " + numbers.size()); // Output: Size: 3
        
        numbers.remove(10);
        
        System.out.println("Contains 10: " + numbers.contains(10)); // Output: Contains 10: false
        
        for (Integer num : numbers) {
            System.out.println(num);
        }
    }
}

