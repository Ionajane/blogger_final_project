import React from 'react';
import {Link} from 'react-router-dom';

const NavBar = (props) => {
  return (
    <header>
      <ul>
        <li className="nav-link"> <Link to="/"> Home</Link></li>
        <li className="nav-link"> <Link to="/articles"> articles</Link></li>
        <li className="nav-link"> <Link to="/journalists"> journalists</Link></li>
      </ul>
    </header>

  )
}

export default NavBar;
