// This stub file contains items that aren't used yet; feel free to remove this module attribute
// to enable stricter warnings.
#![allow(unused)]

use std::collections::HashMap;

pub fn can_construct_note(magazine: &[&str], note: &[&str]) -> bool {
    let mut note_map: HashMap<&str, u8> = HashMap::new();
    
    for note_word in note {
        *note_map.entry(note_word).or_insert(0) += 1;
    }

    for mag_word in magazine {
        if !note_map.contains_key(mag_word) {
            continue;
        }

        match note_map.get_mut(mag_word).unwrap() {
            0 => (),
            w => *w -= 1,
        }
    }

    note_map.values().sum::<u8>() == 0
}
