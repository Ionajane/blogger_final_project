import React from 'react';


const ArticleForm = (props) => {

  function handleSubmit(event){
    event.preventDefault();

    const article = {
      "title": event.target.title.value,
      "date": event.target.date.value,
      "category": event.target.category.value,
      "body": event.target.body.value,
      "journalist": event.target.journalist.value
    }
    props.handleArticlePost(article)

  }

  // const journalistOptions = props.journalists.map( (journalist, index) => {
  //   return
  //   <option key={index} value{journalist._links.self.href}>
  //   {journalist.fName}{journalist.lName}
  //   </option>
  // })

  return (
    <div className="add-article">
      <form onSubmit={handleSubmit}>
        <label>TITLE <input type="text" name="title"/></label>
        <label>CATEGORY <input type="text" name="category"/></label>
        <label>DATE <input type="Date" placeholder="Date" name="date"/></label>
        <input type="textarea" placeholder="Insert body of post" name="body"/>

        <button type="submit">Save</button>
      </form>

    </div>
  )

}

export default ArticleForm;
